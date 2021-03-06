// Copyright (C) 2016 MapRoulette contributors (see CONTRIBUTORS.md).
// Licensed under the Apache License, Version 2.0 (see LICENSE).
package org.maproulette.session

import org.maproulette.actions.{GroupType, ItemType}
import org.maproulette.models.BaseObject
import play.api.libs.json.{Json, Reads, Writes}

/**
  * @author cuthbertm
  */
case class Group(override val id:Long,
                 override val name:String,
                 projectId:Long,
                 groupType:Int) extends BaseObject[Long] {
  override val itemType: ItemType = GroupType()
}

object Group {
  implicit val groupWrites: Writes[Group] = Json.writes[Group]
  implicit val groupReads: Reads[Group] = Json.reads[Group]

  val TYPE_SUPER_USER = -1
  val TYPE_ADMIN = 1
}

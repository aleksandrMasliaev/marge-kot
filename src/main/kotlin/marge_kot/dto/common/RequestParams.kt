package marge_kot.dto.common

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

enum class Scope {
  @SerialName("created_by_me")
  CREATED_BY_ME,

  @SerialName("assigned_to_me")
  ASSIGNED_TO_ME,

  @SerialName("all")
  ALL,
  ;
}

enum class State {
  @SerialName("opened")
  OPENED,

  @SerialName("closed")
  CLOSED,

  @SerialName("locked")
  LOCKED,

  @SerialName("merged")
  MERGED,
}

@Serializable
@JvmInline
value class Branch(val name: String)
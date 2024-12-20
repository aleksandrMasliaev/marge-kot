package marge_kot.data.dto.merge_request

import io.ktor.resources.Resource
import kotlinx.serialization.Serializable

@Resource("approvals")
data class MergeRequestApprovalsRequest(val parent: MergeRequestRequest)

@Serializable
data class MergeRequestApprovals(
  val approved: Boolean,
)
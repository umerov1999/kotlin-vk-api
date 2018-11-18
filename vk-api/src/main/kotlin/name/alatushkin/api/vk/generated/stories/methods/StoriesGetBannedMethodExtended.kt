package name.alatushkin.api.vk.generated.stories.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkList
import name.alatushkin.api.vk.api.VkResponse

/**
 *  Returns list of sources hidden from current user's feed.
 *
 *  [https://vk.com/dev/stories.getBanned]
 *  @property [fields] Additional fields to return
 */
class StoriesGetBannedMethodExtended() : VkMethod<VkList<Long>>(
    "stories.getBanned",
    mutableMapOf("extended" to "1")
) {

    var fields: Array<String>? by props

    constructor(
        fields: Array<String>? = null
    ) : this() {
        this.fields = fields
    }

    fun setFields(fields: Array<String>): StoriesGetBannedMethodExtended {
        this.fields = fields
        return this
    }

    override val classRef = StoriesGetBannedMethodExtended.classRef

    companion object {
        val classRef = object : TypeReference<VkResponse<VkList<Long>>>() {}
    }
}

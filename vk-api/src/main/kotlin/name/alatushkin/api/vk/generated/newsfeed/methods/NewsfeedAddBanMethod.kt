package name.alatushkin.api.vk.generated.newsfeed.methods

import com.fasterxml.jackson.core.type.TypeReference
import name.alatushkin.api.vk.VkMethod
import name.alatushkin.api.vk.api.VkSuccess

/**
 *  Prevents news from specified users and communities from appearing in the current user's newsfeed.
 *
 *  [https://vk.com/dev/newsfeed.addBan]
 *  @property [user_ids]
 *  @property [group_ids]
 */
class NewsfeedAddBanMethod() : VkMethod<Boolean>(
    "newsfeed.addBan",
    HashMap()
) {

    var userIds: Array<Long>? by props
    var groupIds: Array<Long>? by props

    constructor(
        userIds: Array<Long>? = null,
        groupIds: Array<Long>? = null
    ) : this() {
        this.userIds = userIds
        this.groupIds = groupIds
    }

    fun setUserIds(userIds: Array<Long>): NewsfeedAddBanMethod {
        this.userIds = userIds
        return this
    }

    fun setGroupIds(groupIds: Array<Long>): NewsfeedAddBanMethod {
        this.groupIds = groupIds
        return this
    }

    override val classRef = NewsfeedAddBanMethod.classRef

    companion object {
        val classRef = object : TypeReference<VkSuccess<Boolean>>() {}
    }
}

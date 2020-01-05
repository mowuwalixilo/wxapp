package com.wxapp.task;

import com.wxapp.api.friend.FriendAction;
import com.wxapp.entity.GetFriendListInfo;

import java.util.concurrent.Callable;

public class GetFriendListTask implements Callable<String> {

    private FriendAction friendAction;
    private GetFriendListInfo getFriendListInfo;

    public GetFriendListTask(FriendAction friendAction, GetFriendListInfo getFriendListInfo) {
        this.friendAction = friendAction;
        this.getFriendListInfo = getFriendListInfo;
    }

    @Override
    public String call() throws Exception {
        String friendsList = friendAction.getFriendsList(getFriendListInfo);
        return friendsList;
    }
}

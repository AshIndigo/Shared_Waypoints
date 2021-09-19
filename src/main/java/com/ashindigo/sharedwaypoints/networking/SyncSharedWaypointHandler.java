package com.ashindigo.sharedwaypoints.networking;

import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class SyncSharedWaypointHandler implements IMessageHandler<SyncSharedWaypoint, IMessage> {

    @Override
    public IMessage onMessage(SyncSharedWaypoint message, MessageContext ctx) {

        return null; // No response pakcet
    }
}

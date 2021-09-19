package com.ashindigo.sharedwaypoints.client;

import com.ashindigo.sharedwaypoints.SharedWaypoints;
import journeymap.client.api.ClientPlugin;
import journeymap.client.api.IClientAPI;
import journeymap.client.api.IClientPlugin;
import journeymap.client.api.display.Context;
import journeymap.client.api.event.ClientEvent;

@ClientPlugin
public class SharedWaypointsPlugin implements IClientPlugin {

    private IClientAPI jmClientApi;

    @Override
    public void initialize(IClientAPI jmClientApi) {
        this.jmClientApi = jmClientApi;
    }

    @Override
    public String getModId() {
        return SharedWaypoints.MODID;
    }

    @Override
    public void onEvent(ClientEvent event) {
        switch (event.type) {

            case DISPLAY_UPDATE:
                break;
            case DEATH_WAYPOINT:
                break;
            case MAPPING_STARTED:
                break;
            case MAPPING_STOPPED:
                break;
        }
    }
}

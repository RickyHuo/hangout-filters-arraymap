package com.bip.hangout.filters;

import com.ctrip.ops.sysdev.baseplugin.BaseFilter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by huochen on 2017/05/24
 */

public class ArrayMap extends BaseFilter {

    private List<String> sources;

    public ArrayMap(Map config) { super (config);}

    @Override
    protected void prepare(){
        this.sources = (List<String>) config.get("fields");
        this.processExtraEventsFunc = true;
    }

    @Override
    protected Map filter(Map event) {

//        if(this.processExtraEventsFunc == true) {
//            return event;
//        }

        return event;
    }

    @Override
    protected List<Map<String, Object>> filterExtraEvents(Map event) {
        ArrayList<Map<String, Object>> events =  new ArrayList<Map<String, Object>>();
        for(String field: this.sources){
            if(!event.containsKey(field)){
                continue;
            }

            List<Map> msg = (List) event.get(field);

            for(Map item: msg){
                // event.remove(field);
                Map tmp = new HashMap();
                tmp.putAll(event);
                tmp.putAll(item);

                events.add(tmp);
            }
        }

        return events;
    }
}

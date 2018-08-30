package com.dazhi6.behavior.interceptingFilter;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤链
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();
    private Target target;  //标靶

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public void execute(String request){
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target){
        this.target = target;
    }
}

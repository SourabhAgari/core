package com.sra.systemdesign.lld.designpattern.behavioral.strategy.simple;

import java.util.HashMap;
import java.util.Map;

public abstract class Robot {
    private final Map<Class<? extends RobotCapability>, RobotCapability> capabilities = new HashMap<>();

    public <T extends RobotCapability> void addCapability(Class<T> type, T implementation){
        capabilities.put(type, implementation);
    }

    @SuppressWarnings("unchecked")
    public <T extends RobotCapability> T getCapability(Class<T> type) {
        return (T) capabilities.get(type);
    }

    public void performCapability(Class<? extends RobotCapability> type) {
        RobotCapability cap = capabilities.get(type);
        if (cap == null) {
            System.out.println("Capability not available: " + type.getSimpleName());
        }
    }
}

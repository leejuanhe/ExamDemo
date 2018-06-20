package com.migu.schedule.info;

public class TaskBasicInfo {
    private int nodeId;
    private int taskId;
    private int consumption;

    public TaskBasicInfo() {}

    public TaskBasicInfo(int taskId, int consumption) {
        this.nodeId = -1;
        this.taskId = taskId;
        this.consumption = consumption;
    }

    public TaskBasicInfo(int nodeId, int taskId, int consumption) {
        this.nodeId = nodeId;
        this.taskId = taskId;
        this.consumption = consumption;
    }

    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public int getNodeId() {
        return nodeId;
    }

    public void setNodeId(int nodeId) {
        this.nodeId = nodeId;
    }

    @Override
    public String toString() {
        return "TaskBasicInfo{" +
                "nodeId=" + nodeId +
                ", taskId=" + taskId +
                ", consumption=" + consumption +
                '}';
    }
}

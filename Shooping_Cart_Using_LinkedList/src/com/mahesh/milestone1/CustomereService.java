package com.mahesh.milestone1;
import java.util.Queue;
import java.util.LinkedList;

public class CustomereService {
    private Queue<String> requests;

    public CustomereService() {
        requests = new LinkedList<>();
    }

    public void addRequest(String request) {
        requests.add(request);
    }

    public void processRequests() {
        while (!requests.isEmpty()) {
            System.out.println("Processing request: " + requests.poll());
        }
    }

    public void viewPendingRequests() {
        System.out.println("Pending Requests:");
        for (String request : requests) {
            System.out.println(request);
        }
    }
}
package OAAmazon;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

class TotalResponseTime {

    public static long totalResponseTime(List<Integer> responseTimes) {
        long answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        Map<Integer, Queue<Integer>> mapa = new HashMap<>();
        // trcking
        boolean[] active = new boolean[responseTimes.size()];

        for (int i = 0; i < responseTimes.size(); i++) {
            int latency = responseTimes.get(i);
            mapa.computeIfAbsent(latency, x -> new ArrayDeque<>()).add(i);
            pq.add(latency);
            active[i] = true;
        }

        while (!pq.isEmpty()) {
            int minLatency = pq.poll();
            int minIndex = mapa.get(minLatency).poll();

            // Skip
            if (!active[minIndex]) continue;

            answer += minLatency;

            // Remove item
            active[minIndex] = false;

            // Remove left
            if (minIndex - 1 >= 0)
                active[minIndex - 1] = false;

            // Remove right
            if (minIndex + 1 < active.length)
                active[minIndex + 1] = false;
        }return answer;
    }
}

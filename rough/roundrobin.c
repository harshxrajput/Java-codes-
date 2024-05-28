#include <stdio.h>
#include <stdlib.h>

struct Process {
    int pid;
    int AT;
    int BT;
    int RT;      // Remaining_time
    int CT;
    int WT;
    int TAT;     // Turnaround Time
};

int compare(const void *a, const void *b){
    struct Process *p1 = (struct Process *)a;
    struct Process *p2 = (struct Process *)b;
    return p1->AT - p2->AT;
}

int main() {
    int n, quantum;
    printf("Enter the number of processes: ");
    scanf("%d", &n);

    printf("Enter the time quantum: ");
    scanf("%d", &quantum);

    struct Process *processes = (struct Process *)malloc(n * sizeof(struct Process));
    if (processes == NULL) {
        printf("Memory allocation failed.\n");
        return 1;
    }

    for (int i = 0; i < n; i++) {
        printf("Enter arrival time and burst time of process %d: ", i + 1);
        scanf("%d %d", &processes[i].AT, &processes[i].BT);
        processes[i].pid = i + 1;
        processes[i].RT = processes[i].BT;
    }

    qsort(processes, n, sizeof(struct Process), compare);

    int currentTime = processes[0].AT;
    int completed = 0;
    //////////////////////////////////////////////////////////////////////////
    while (completed < n) {
        int flag = 0; // track if any process executes in the current time quantum
        for (int i = 0; i < n; i++) {
            if (processes[i].RT > 0 && processes[i].AT <= currentTime) {
                flag = 1; // one process execution started
                if (processes[i].RT > quantum) {
                    currentTime += quantum;
                    processes[i].RT -= quantum;
                } 
                else {
                    currentTime += processes[i].RT;
                    processes[i].RT = 0;
                    completed++;
                    processes[i].CT = currentTime;
                    processes[i].TAT = processes[i].CT - processes[i].AT;
                    processes[i].WT = processes[i].TAT - processes[i].BT;
                }
            }
        }
        if (!flag) {
            // No process executed in this quantum
            currentTime++;
        }
    }
    //////////////////////////////////////////////////////////////////////////

    float avg_WT = 0;
    float avg_TAT = 0;
    for (int i = 0; i < n; i++) {
        avg_WT += processes[i].WT;
        avg_TAT += processes[i].TAT;
    }
    avg_WT /= n;
    avg_TAT /= n;

    printf("\nProcess\tArrival Time\tBurst Time\tCompletion Time\t\tWaiting Time\t\tTurnaround Time\n");
    for (int i = 0; i < n; i++) {
        printf("%d\t\t%d\t\t%d\t\t%d\t\t\t%d\t\t\t%d\n", processes[i].pid, processes[i].AT, processes[i].BT, processes[i].CT, processes[i].WT, processes[i].TAT);
    }
    printf("\nAverage Waiting Time: %.2f\n", avg_WT);
    printf("Average Turnaround Time: %.2f\n", avg_TAT);

    free(processes);

    return 0;
}
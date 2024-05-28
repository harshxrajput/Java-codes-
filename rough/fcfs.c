#include <stdio.h>

struct process {
    int pid, at, bt, wt, tat;
};

void swap(struct process *a, struct process *b) {
    struct process temp = *a;
    *a = *b;
    *b = temp;
}

int main() {
    int n;
    printf("Enter the number of processes: ");
    scanf("%d", &n);
    struct process p[n];
    for (int i = 0; i < n; i++) {
        printf("Enter the Arrival Time and Burst Time of Process %d: ", i + 1);
        p[i].pid = i + 1;
        scanf("%d %d", &p[i].at, &p[i].bt);
    }

    for (int i = 0; i < n - 1; i++) {
        int min = i;
        for (int j = i + 1; j < n; j++) {
            if (p[j].at < p[min].at) {
                min = j;
            }
        }
        swap(&p[i], &p[min]);
    }

    int time = p[0].at;
    for (int i = 0; i < n; i++) {
        if (p[i].at > time) {
            time = p[i].at;
        }
        p[i].wt = time - p[i].at;
        time += p[i].bt;
        p[i].tat = time - p[i].at;
    }

    printf("PID\tAT\tBT\tWT\tTAT\n");
    for (int i = 0; i < n; i++) {
        printf("%d\t%d\t%d\t%d\t%d\n", p[i].pid, p[i].at, p[i].bt, p[i].wt, p[i].tat);
    }

    float avg_wt = 0, avg_tat = 0;
    for (int i = 0; i < n; i++) {
        avg_wt += p[i].wt;
        avg_tat += p[i].tat;
    }
    avg_wt = avg_wt / n;
    avg_tat = avg_tat / n;
    printf("Average WT: %.1f\n", avg_wt);
    printf("Average TAT: %.1f\n", avg_tat);
}
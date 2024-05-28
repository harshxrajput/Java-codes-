#include <stdio.h>

struct Process
{
    int pid;
    int arrivalTime;
    int burstTime;
    int waitingTime;
    int turnaroundTime;
    int completionTime;
};

void swap(struct Process *a, struct Process *b)
{
    struct Process temp = *a;
    *a = *b;
    *b = temp;
}

void sortProcessesByBurstTime(struct Process proc[], int n)
{
    for (int i = 0; i < n - 1; i++)
    {
        for (int j = i + 1; j < n; j++)
        {
            if (proc[i].burstTime > proc[j].burstTime)
            {
                swap(&proc[i], &proc[j]);
            }
        }
    }
}

void findWaitingTimeTurnaroundTime(struct Process proc[], int n)
{
    proc[0].waitingTime = 0;

    for (int i = 1; i < n; i++)
    {
        proc[i].waitingTime = proc[i - 1].waitingTime + proc[i - 1].burstTime;
    }

    for (int i = 0; i < n; i++)
    {
        proc[i].turnaroundTime = proc[i].waitingTime + proc[i].burstTime;
        proc[i].completionTime = proc[i].turnaroundTime + proc[i].arrivalTime;
    }
}

void printProcessDetails(struct Process proc[], int n)
{
    printf("PID\tAT\tBT\tWT\tTAT\tCT\n");
    for (int i = 0; i < n; i++)
    {
        printf("%d\t%d\t%d\t%d\t%d\t%d\n", proc[i].pid, proc[i].arrivalTime,
               proc[i].burstTime, proc[i].waitingTime, proc[i].turnaroundTime, proc[i].completionTime);
    }
}

void calculateAverageTimes(struct Process proc[], int n)
{
    int totalWaitingTime = 0, totalTurnaroundTime = 0;
    for (int i = 0; i < n; i++)
    {
        totalWaitingTime += proc[i].waitingTime;
        totalTurnaroundTime += proc[i].turnaroundTime;
    }

    float avgWaitingTime = (float)totalWaitingTime / n;
    float avgTurnaroundTime = (float)totalTurnaroundTime / n;

    printf("\nAverage Waiting Time: %.2f\n", avgWaitingTime);
    printf("Average Turnaround Time: %.2f\n", avgTurnaroundTime);
}

int main()
{
    int n;

    printf("Enter the number of processes: ");
    scanf("%d", &n);

    struct Process proc[n];

    for (int i = 0; i < n; i++)
    {
        printf("Enter details for process %d:\n", i + 1);
        printf("PID: ");
        scanf("%d", &proc[i].pid);
        printf("Arrival Time: ");
        scanf("%d", &proc[i].arrivalTime);
        printf("Burst Time: ");
        scanf("%d", &proc[i].burstTime);
    }

    sortProcessesByBurstTime(proc, n);
    findWaitingTimeTurnaroundTime(proc, n);
    printf("\nSJF Scheduling Details:\n");
    printProcessDetails(proc, n);
    calculateAverageTimes(proc, n);

    return 0;
}
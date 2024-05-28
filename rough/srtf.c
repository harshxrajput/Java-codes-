#include <limits.h>
#include <stdio.h>

struct process
{
    int pid, at, bt, wt, tat, rem_time;
};


int main()
{
    int n;
    printf("Enter the number of processes: ");
    scanf("%d", &n);
    struct process p[n];
    for (int i = 0; i < n; i++)
    {
        printf("Enter the Arrival Time and Burst Time of Process %d: ", i + 1);
        p[i].pid = i + 1;
        scanf("%d %d", &p[i].at, &p[i].bt);
        p[i].rem_time = p[i].bt;
    }

    int complete = 0, time = 0, min = INT_MAX, shortest = 0;

    while (complete != n)
    {
        min = INT_MAX;
        for (int j = 0; j < n; j++)
        {
            if (p[j].at <= time && p[j].rem_time < min && p[j].rem_time > 0)
            {
                min = p[j].rem_time;
                shortest = j;
            }
        }

        if (min == INT_MAX)
        {
            time++;
            continue;
        }

        p[shortest].rem_time--;

        if (p[shortest].rem_time == 0)
        {
            complete++;
            const int finish_time = time + 1;
            p[shortest].wt = finish_time - p[shortest].bt - p[shortest].at;
            if (p[shortest].wt < 0)
                p[shortest].wt = 0;
            p[shortest].tat = p[shortest].wt + p[shortest].bt;
        }
        time++;
    }


    printf("PID\tAT\tBT\tWT\tTAT\n");
    for (int i = 0; i < n; i++)
    {
        printf("%d\t%d\t%d\t%d\t%d\n", p[i].pid, p[i].at, p[i].bt, p[i].wt, p[i].tat);
    }

    int total_waiting_time = 0, total_turnaround_time = 0;
    for (int i = 0; i < n; i++)
    {
        total_waiting_time += p[i].wt;
        total_turnaround_time += p[i].tat;
    }

    printf("\nAverage Waiting Time: %.2f\n", (float)total_waiting_time / n);
    printf("Average Turnaround Time: %.2f\n", (float)total_turnaround_time / n);
    return 0;
}
#include<stdio.h>
#include<stdlib.h>

int mutex = 1;
int wrt = 1;
int readcnt = 0;

void wait(int *S) {
    while (*S <= 0);
    *S = *S - 1;
}

void signal(int *S) {
    *S = *S + 1;
}

void reader() {
    do {
        wait(&mutex);
        readcnt++;
        if (readcnt == 1)
            wait(&wrt);
        signal(&mutex);

        printf("Reading data: Shared data\n");
        
        wait(&mutex);
        readcnt--;
        if (readcnt == 0)
            signal(&wrt);
        signal(&mutex);
    } while (1);
}

void writer() {
    do {
        wait(&wrt);
        printf("Enter data to write: ");
        signal(&wrt);
    } while (1);
}

int main() {
    int choice;

    while (1) {
        printf("\n1. Reader\n2. Writer\n3. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                reader();
                break;
            case 2:
                writer();
                break;
            case 3:
                exit(0);
            default:
                printf("Invalid choice!\n");
        }
    }

    return 0;
}

#include <stdio.h>
#include <stdlib.h>

int wrt = 1;
int mutex = 1;
int read = 0;

int wait(int s)
{
    s--;
    return s;
}

int signal(int s)
{
    s++;
    return s;
}

void writer()
{
    wrt = wait(wrt);
    printf("writing............!!!!\n");
    wrt = signal(wrt);
}

void reader()
{

    mutex = wait(mutex);
    read++;
    if (read == 1)
        wrt = wait(wrt);
    mutex = signal(mutex);
    printf("reading............!!!!\n");

    mutex = wait(mutex);
    read--;
    if (read == 0)
    {
        wrt = signal(wrt);
    }
    mutex = signal(mutex);
}

int main()
{
    int choice;

    do {
        printf("\nMenu:\n");
        printf("1. Reader\n");
        printf("2. Writer\n");
        printf("3. Exit\n");
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
                printf("Exiting......!!!!\n");
                exit(0);
            default:
                printf("Invalid choice! Please enter a valid option.\n");
        }
    } while (1);

return 0;

}
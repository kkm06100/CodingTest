#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_QUEUE_SIZE 20000

int queue[MAX_QUEUE_SIZE];
int front = -1;
int rear = -1;
int size = 0;

void push(int value) {
    if (size < MAX_QUEUE_SIZE) {
        rear = (rear + 1) % MAX_QUEUE_SIZE;
        queue[rear] = value;
        size++;
    } 
}

void pop() {
    if (size == 0) {
        printf("-1\n");
    } else {
        front = (front + 1) % MAX_QUEUE_SIZE;
        printf("%d\n", queue[front]);
        size--;
    }
}

void print_size() {
    printf("%d\n", size);
}

void empty() {
    if (size == 0) {
        printf("1\n");
    } else {
        printf("0\n");
    }
}

void print_front() {
    if (size == 0) {
        printf("-1\n");
    } else {
        printf("%d\n", queue[(front + 1) % MAX_QUEUE_SIZE]);
    }
}

void print_back() {
    if (size == 0) {
        printf("-1\n");
    } else {
        printf("%d\n", queue[rear]);
    }
}

int main() {
    int roop;
    scanf("%d", &roop);
    
    while (roop--) {
        char command[10];
        scanf("%s", command);
        
        if (strcmp(command, "push") == 0) {
            int value;
            scanf("%d", &value);
            push(value);
        } else if (strcmp(command, "pop") == 0) {
            pop();
        } else if (strcmp(command, "size") == 0) {
            print_size();
        } else if (strcmp(command, "empty") == 0) {
            empty();
        } else if (strcmp(command, "front") == 0) {
            print_front();
        } else if (strcmp(command, "back") == 0) {
            print_back();
        }
    }
    
    return 0;
}

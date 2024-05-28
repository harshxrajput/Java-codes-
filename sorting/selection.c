#include<stdio.h>
#include<stdlib.h>

void selection_sort(int A[] , int n){

printf("unsorted array : ");
          for(int l=0;l<n;l++){
          printf("%d ",A[l]);
    }

    for(int i=0;i<n-1;i++){
        int min=A[i];
        int loc=i;
        for(int j=i+1;j<n;j++){
            if(min >A[j]){
                min=A[j];
                loc=j;
            }
        }
        int temp=A[i];
         A[i]=A[loc];
        A[loc]=temp;
    }
    printf("\n");
    printf("sorted array : ");
    for(int k=0;k<n;k++){
        printf("%d ", A[k]);
    }
}

int main(){
    int Arr[]={2,4,7,9,5,8,1};  
    selection_sort(Arr,sizeof(Arr)/sizeof(Arr[0]));
return 0;
}
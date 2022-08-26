#include<iostream>
#include<cstdlib>

using namespace std;

struct nodo{

    char a;//campo donde se almacenara el caracter
    struct nodo *sgte;
};

typedef struct nodo *pila;

/*---------------Funcion para Apilar un Caracter--------*/
void apila(pila &p,const char a){

    pila q=new (struct nodo) ;
    q->a=a;
    q->sgte=p;
    p=q;
 }

/*------------- Funcion para Desapilar un elemento -----*/
void desapila(pila &p){

    int n=p->a;

    pila q=p;
    p=p->sgte;
    delete(q);
}

 /*------Funcion que decidir si se apila o desapila----*/
int recorrer(int e,char letra, pila &p){

    const char a='x';

    if(e==0&&letra=='a'){
        apila(p,a);
        return 0;
        }

        if(e==0&&letra=='b'){
            desapila(p);
            return 1;
        }

        if(e==1&&letra=='b'){
            desapila(p);
            return 1;
        }

    return 0;
 }

 /*---------- Lee la palabra Ingresada  -------------*/
void leer(char pal[], pila &p){

    int estado=0;
    int i=0;

    cout<<"\te. inicial//letra\n";
    while(pal[i]){
        cout<<"\t"<<estado<<"      "<<pal[i]<<endl;
        estado=recorrer(estado,pal[i],p);
        i++;
    }

  if(estado==1&&p==NULL)
  cout<<"\n\tPalabra aceptada";

  else

  cout<<"\n\tPalabra rechazada";
  }

/*----------------Funcion Principal----------------*/
int main(void){

    system("color 0a");
    pila p=NULL;//inicializamos la pila

    cout<<"\n\n\t*****AUTOMATA CON PILA*******\n\n";
    char w[50]="aabb";//Cambiar la Palabra Aqui...!!!!
    leer(w,p);
    cout<<endl<<endl;
    return 0;
}
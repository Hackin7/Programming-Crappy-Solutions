
//Count 1:
main(){int(i)=1;for(;i<1e4;i++)printf("%d,",i);}
main(){int(i)=0;for(;++i<1e4;)printf("%d,",i);}

//Trick
i;main(){for(;++i-2e4/2;)printf("%d,",i);}
//Inspiration
main(i){(2e4/2-i)&&(printf("%d,",i),main(++i));} 

//Experiments
main(i){printf("%d,",i),(2e4/2-i)&&main(++i);} //Failed
main(i){(2e4/2-i)&&printf("%d,",i),main(++i);}
main(i){if(2e4/2-i)printf("%d,",i),main(++i);} //Works

//Looping WaYS
main(i){for(;;){printf("%d,",i);(2e4/2-i)&&++i;}} //Hangs
i;main(){a:if(++i-1e4){printf("%d,",i);goto a;}} //Works But space
i;main(){while(++i-1e4)printf("%d,",i);} //Works

main(i){(10000-i)&&(printf("%d,",i),main(++i));}

//Count 3
d;main(){___d__m_________a;++d;}
__ma________d__m_________a___d__

//Q4

main(i){if(9999/i)printf("%d,",i),main(++i);}

Class PrimeNumbers
{
public static void main(String[]args)
{
int  i=0;
int num=0;
String primeNumbers ="";

for(i=1;i<=100;i++)
{
int counter=0;
for(num =i; num>=1; num--)
{
if(counter==2)
{
PrimeNumbers=PrimeNumbers +i+"";
}
}
System.out.println("PrimeNumbers from 1to 100 are :");
System.out.println(PrimeNumbers);
}
}
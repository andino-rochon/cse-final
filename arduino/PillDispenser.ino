#include <Servo.h>

Servo servo;
int led = A1;
int buzzer = 4;
int vibMotor = 3;
int waitTime = 30000;
int dosage = 1;

void setup() {
  // put your setup code here, to run once:
  pinMode(buzzer, OUTPUT);
  pinMode(vibMotor, OUTPUT);
  pinMode(led, OUTPUT);
  servo.attach(8);
  servo.write(90);
  delay(2000);
}

void loop() {
  // put your main code here, to run repeatedly:
  servo.write(85);
  delay(waitTime);
  alert();
  servo.write(0);
  delay(10000);
}


void alert() {
  digitalWrite(vibMotor, HIGH);
  digitalWrite(buzzer, HIGH);
  digitalWrite(led, HIGH);
  delay(500);
  digitalWrite(vibMotor, LOW);
  digitalWrite(buzzer, LOW);
  digitalWrite(led, LOW);
  delay(500);
  digitalWrite(vibMotor, HIGH);
  digitalWrite(buzzer, HIGH);
  digitalWrite(led, HIGH);
  delay(500);
  digitalWrite(vibMotor, LOW);
  digitalWrite(buzzer, LOW);
  digitalWrite(led, LOW);
  delay(500);
  digitalWrite(vibMotor, HIGH);
  digitalWrite(buzzer, HIGH);
  digitalWrite(led, HIGH);
  delay(500);
  digitalWrite(vibMotor, LOW);
  digitalWrite(buzzer, LOW);
  digitalWrite(led, LOW);
  delay(500);
  digitalWrite(vibMotor, HIGH);
  digitalWrite(buzzer, HIGH);
  digitalWrite(led, HIGH);
  delay(500);
  digitalWrite(vibMotor, LOW);
  digitalWrite(buzzer, LOW);
  digitalWrite(led, LOW);
  delay(500);
  
}
����   = >  newproj/dary  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Lnewproj/dary; main ([Ljava/lang/String;)V	    java/time/Month   MARCH Ljava/time/Month;
    java/time/LocalDate   of *(ILjava/time/Month;I)Ljava/time/LocalDate;	     APRIL	   " ! java/time/temporal/ChronoUnit # $ DAYS Ljava/time/temporal/ChronoUnit;
   & ' ( between =(Ljava/time/temporal/Temporal;Ljava/time/temporal/Temporal;)J	 * , + java/lang/System - . out Ljava/io/PrintStream;
 0 2 1 java/io/PrintStream 3 4 println (J)V args [Ljava/lang/String; 
dateBefore Ljava/time/LocalDate; 	dateAfter noOfDaysBetween J 
SourceFile 	dary.java !               /     *� �    
                    	       �     (� � L� � M� +,� %B� )!� /�    
               '     *    ( 5 6     7 8    9 8     : ;   <    =
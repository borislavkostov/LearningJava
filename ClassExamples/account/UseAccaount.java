����   4 ?  UseAccaount  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this LUseAccaount; main ([Ljava/lang/String;)V  Account
  	  Borislav
     setName (Ljava/lang/String;)V  Sofia
     
setAddress@mP     
 ! # " java/lang/Double $ % valueOf (D)Ljava/lang/Double;
  ' ( ) 
setBalance (Ljava/lang/Double;)V	 + - , java/lang/System . / out Ljava/io/PrintStream;
  1 2 3 
getAddress ()Ljava/lang/String;
 5 7 6 java/io/PrintStream 8  println arg [Ljava/lang/String; 	myAccount 	LAccount; 
SourceFile UseAccaount.java !               /     *� �    
                    	       q     )� Y� L+� +� + �  � &� *+� 0� 4�    
             	  
 (         ) 9 :    ! ; <   =    >
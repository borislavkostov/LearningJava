����   4 9  Employee/Employee  java/lang/Object name Ljava/lang/String; jobTitle <init> ()V Code
    	 LineNumberTable LocalVariableTable this LEmployee/Employee; getName ()Ljava/lang/String;	     setName (Ljava/lang/String;)V getJobTitle	     setJobTitle cutCheck (D)V	     java/lang/System ! " out Ljava/io/PrintStream; $ Pay to the order of %s 
 & ( ' java/io/PrintStream ) * printf <(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/PrintStream; , 	(%s) ***$ . %,.2f

 0 2 1 java/lang/Double 3 4 valueOf (D)Ljava/lang/Double; 
amountPaid D 
SourceFile Employee.java !                   	  
   /     *� �                            
   /     *� �           	                 
   >     *+� �       
                             
   /     *� �                            
   >     *+� �       
                             
   }     =� #� Y*� S� %W� +� Y*� S� %W� -� Y'� /S� %W�              (  <         =       = 5 6   7    8
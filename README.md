
# Ex.No:7 Develop an android application to display the country name with image using list view in android studio.


## AIM:

To create and develop the application to display the place name with image using list view in android studio

## EQUIPMENTS REQUIRED:

Android Studio(Latest Version)

## ALGORITHM:

Step 1: Open Android Stdio and then click on File -> New -> New project.

Step 2: Then type the Application name as “listview″ and click Next. 

Step 3: Then select the Minimum SDK as shown below and click Next.

Step 4: Then select the Empty Activity and click Next. Finally click Finish.

Step 5: Design layout in activity_main.xml.

Step 6: Get contacts details and Display details give in MainActivity file.

Step 7: Save and run the application.

## PROGRAM:
```
/*
Program to print the list of item.
Developed by:Kanmani U
Registeration Number :212221040070
*/
```
### Activity_Main.java
```
Main activity: package com.example.list_view;

import android.os.Bundle; import android.widget.ArrayAdapter; import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

ListView simpleList;
String countryList[] = {"India", "China", "australia", "Portugal", "America", "NewZealand"};

@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    simpleList = (ListView)findViewById(R.id.simpleListView);
    ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_listview, R.id.textView, countryList);
    simpleList.setAdapter(arrayAdapter);
}
}
```
### activity_main.xml
```
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android" xmlns:app="http://schemas.android.com/apk/res-auto" xmlns:tools="http://schemas.android.com/tools" android:layout_width="match_parent" android:layout_height="match_parent" tools:context=".MainActivity">

<ListView
    android:id="@+id/simpleListView"
    android:layout_width="fill_parent"
    android:layout_height="wrap_content"
    android:divider="#00008B"
    android:dividerHeight="1dp"
    android:listSelector="#87CEEB"
    app:layout_constraintBottom_toBottomOf="parent"
    app:layout_constraintEnd_toEndOf="parent"
    app:layout_constraintStart_toStartOf="parent"
    app:layout_constraintTop_toTopOf="parent" />
</androidx.constraintlayout.widget.ConstraintLayout>
```
### Activity_listview
```
<TextView
    android:id="@+id/textView"
    android:layout_width="fill_parent"
    android:layout_height="wrap_content"
    android:layout_gravity="center"
    android:padding="16dp"
    android:textColor="#2359E3" />
```

## OUTPUT
![Screenshot 2024-04-08 092057](https://github.com/kanmanikannu/listview/assets/114866367/81c9a9db-63d5-4919-8864-392fb5f31253)




## RESULT
Thus a Simple Android Application to create and develop the application to display the country name with image using list view in android studio is developed and executed successfully.

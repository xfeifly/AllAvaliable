package edu.cmu.nsompura.allavailable.models;

import android.util.Log;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class building
{
    static int buildingNumber=23;
    public List<room> rooms=new ArrayList<room>();
    public void setBuildingNumber(int buildingNumber1)
    {
        this.buildingNumber=buildingNumber1;
    }
    public int getBuildingNumber()
    {
        return this.buildingNumber;
    }

    public building(int buildingNumber1)
    {
        if(buildingNumber==19)
        {
            for(int i=0;i<5;i++)
            {
                room basicroom=new room();
                rooms.add(i,basicroom);
            }
            rooms.get(0).setRoomNumber(1);
            rooms.get(0).setRoomName("Room 1020");
            rooms.get(1).setRoomNumber(2);
            rooms.get(1).setRoomName("Room 1021");
            rooms.get(2).setRoomNumber(3);
            rooms.get(2).setRoomName("Room 1022");
            rooms.get(3).setRoomNumber(4);
            rooms.get(3).setRoomName("Room 1023");
            rooms.get(4).setRoomNumber(5);
            rooms.get(4).setRoomName("Room 1024");
        }
        else if(buildingNumber==23)
        {
            for(int i=0;i<5;i++)
            {
                room basicroom=new room();
                rooms.add(i,basicroom);
            }
            rooms.get(0).setRoomNumber(1);
            rooms.get(0).setRoomName("Room 129A");
            rooms.get(1).setRoomNumber(2);
            rooms.get(1).setRoomName("Room 129B");
            rooms.get(2).setRoomNumber(3);
            rooms.get(2).setRoomName("Room 228B");
            rooms.get(3).setRoomNumber(4);
            rooms.get(3).setRoomName("Student Lounge 1");
            rooms.get(4).setRoomNumber(5);
            rooms.get(4).setRoomName("Student Lounge 2");
        }
        else
        {
            Log.i("ERROR WRONG BUILDING NO", buildingNumber + "");
        }
    }

}
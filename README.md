
# Rapport

Efter att ha skapat min fork la jag till en RecyclerView till layouten för att kunna visa upp datan som jag vill 
hämta från ett URL, och jag gav även applikationen möjligheten att använda internet

<uses-permission android:name="android.permission.INTERNET" />

Jag skapade en Arraylist java fil, kallade den mountain och formade den för att kunna ta in informationen som URL 
länken lädde till. Jag skapade även java filer för en Adapter och en Viewholder som jag fyllde in senare, Adaptern 
la jag till som ett variabel i MainActivity.
Sedan gjorde jag lite småändringar, gav recyclerview ett id och fixade error meddelanden, la även till en ny 
version av gson. Jag använde datan i Mountain.json filen tillfälligt och parsade den men hjälp av gson.

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Override
public void onPostExecute(String json) {
Log.d("MainActivity", json);
Gson gson = new Gson();
Type type = new TypeToken<List<Mountain>>() {}.getType();
List<Mountain> listOfMountains = gson.fromJson(json, type);
.
    for (Mountain mountain:listOfMountains){
    Log.d("MainActivity", mountain.getName());
    }
}


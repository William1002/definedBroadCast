package nd.com.definedbroadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by Administrator on 2016/7/28 0028.
 */
public class DefinedBroadCastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context,"This is DefinedBroadCastReceiver",Toast.LENGTH_SHORT).show();
    }
}

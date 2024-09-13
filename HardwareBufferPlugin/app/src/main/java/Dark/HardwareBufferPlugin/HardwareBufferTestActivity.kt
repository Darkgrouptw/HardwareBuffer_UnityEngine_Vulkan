package Dark.HardwareBufferPlugin

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Window
import com.unity3d.player.IUnityPermissionRequestSupport
import com.unity3d.player.IUnityPlayerLifecycleEvents
import com.unity3d.player.IUnityPlayerSupport
import com.unity3d.player.UnityPlayerForActivityOrService



public class HardwareBufferTestActivity: Activity(), IUnityPlayerLifecycleEvents, IUnityPermissionRequestSupport, IUnityPlayerSupport
{
    protected var mUnityPlayer: UnityPlayerForActivityOrService?    = null

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?)
    {
        super.onCreate(savedInstanceState, persistentState)
        requestWindowFeature(Window.FEATURE_NO_TITLE)

        mUnityPlayer = UnityPlayerForActivityOrService(this, this)
    }
}
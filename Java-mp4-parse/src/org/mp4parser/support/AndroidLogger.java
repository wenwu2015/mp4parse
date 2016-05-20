package org.mp4parser.support;


/**
 * Logs on Android.
 */
public class AndroidLogger extends Logger {
    private static final String TAG = "isoparser";
    String name;

    public AndroidLogger(String name) {
        this.name = name;
    }

    @Override
    public void logDebug(String message) {
        Log.d(TAG, name + ":" + message);
        
        
    }

    @Override
    public void logWarn(String message) {
        Log.w(TAG, name + ":" + message);
    }

    @Override
    public void logError(String message) {
        Log.e(TAG, name + ":" + message);
    }
    
    public static class Log{

		public static void d(String tag, String message) {
			// TODO Auto-generated method stub
			System.out.print(tag+":-->"+message);
			
		}

		public static void e(String tag, String message) {
			// TODO Auto-generated method stub
			System.out.print(tag+":-->"+message);
		}

		public static void w(String tag, String message) {
			// TODO Auto-generated method stub
			System.out.print(tag+":-->"+message);
		}
    	
    	
    }
}

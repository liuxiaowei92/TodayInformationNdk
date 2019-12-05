package com.study.todayinformationndk;

import android.opengl.GLSurfaceView;
import android.os.Bundle;

import com.study.opengl.OpenGlManager;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        GLSurfaceView surfaceView = findViewById(R.id.gl_surface_view);
        surfaceView.setRenderer(new GLSurfaceView.Renderer() {
            @Override
            public void onSurfaceCreated(GL10 gl, EGLConfig config) {
                OpenGlManager.onSurfaceCreated();
            }

            @Override
            public void onSurfaceChanged(GL10 gl, int width, int height) {
                OpenGlManager.onSurfaceChanged(width,height);
            }

            @Override
            public void onDrawFrame(GL10 gl) {
                OpenGlManager.onDrawFrame();
            }
        });
    }


}

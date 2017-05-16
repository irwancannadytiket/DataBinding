# DataBinding

### adding in your gradle :
```
android {
    compileSdkVersion 25
    buildToolsVersion "25.0.3"

    dataBinding {
        enabled = true
    }

    defaultConfig {
        applicationId "com.example.irwancannady.databinding"
        minSdkVersion 15
        targetSdkVersion 25
        versionCode 1
        versionName "1.0"
        testInstrumentationRunner "android.support.test.runner.AndroidJUnitRunner"
    }
    buildTypes {
        release {
            minifyEnabled false
            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'
        }
    }
}
```

### set in method onCreate : 
```
 private ActivityMainBinding mBinding; //follow your actvity layout
 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
```

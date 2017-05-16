# DataBinding

### adding in your gradle :
```
dataBinding {
        enabled = true
    }
```

### set in method onCreate : 
```
 @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
```

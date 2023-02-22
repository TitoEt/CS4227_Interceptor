import java.lang.annotation.Annotation;

public class AlertInterceptor implements Interceptor{
    public void onPressureChange(double pressure) {
       System.out.println("Pressure logging interception - changed to"+ pressure);
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        throw new UnsupportedOperationException("Unimplemented method 'annotationType'");
    }

}

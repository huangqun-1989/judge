import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by sanfeng on 2018/8/1.
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface TccMethod {

    // TODO 反向查询需要选择一个好的名字
    String judge() default "";

    String comfirm() default "";

    String cancel() default "";
}

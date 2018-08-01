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

    /**
     * 反查器
     */
    String reverseLookup() default "";

    /**
     * 提交方法
     */
    String comfirm() default "";

    /**
     * 回滚方法
     */
    String cancel() default "";
}

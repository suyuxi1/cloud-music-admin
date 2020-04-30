package com.soft1851.music.admin.util;

import com.soft1851.music.admin.annotation.Sex;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.HashSet;

/**
 * @author su
 * @className NameValidator
 * @Description TODO
 * @Date 2020/4/30
 * @Version 1.0
 **/
public class SexValidator implements ConstraintValidator<Sex, String> {


    @Override
    public boolean isValid(String s, ConstraintValidatorContext constraintValidatorContext) {
        HashSet<Object> sex = new HashSet<>();
        sex.add("男");
        sex.add("女");
        return sex.contains(s);
    }
}

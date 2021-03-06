
package com.airbnb.epoxy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Used to annotate fields on {@link com.airbnb.epoxy.EpoxyModel} classes in order to generate a
 * subclass of that model with getters, setters, equals, and hashcode for the annotated fields.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.CLASS)
public @interface EpoxyAttribute {
}

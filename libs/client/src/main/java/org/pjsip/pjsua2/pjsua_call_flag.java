/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public final class pjsua_call_flag {
  public final static pjsua_call_flag PJSUA_CALL_UNHOLD = new pjsua_call_flag("PJSUA_CALL_UNHOLD", pjsua2JNI.PJSUA_CALL_UNHOLD_get());
  public final static pjsua_call_flag PJSUA_CALL_UPDATE_CONTACT = new pjsua_call_flag("PJSUA_CALL_UPDATE_CONTACT", pjsua2JNI.PJSUA_CALL_UPDATE_CONTACT_get());
  public final static pjsua_call_flag PJSUA_CALL_INCLUDE_DISABLED_MEDIA = new pjsua_call_flag("PJSUA_CALL_INCLUDE_DISABLED_MEDIA", pjsua2JNI.PJSUA_CALL_INCLUDE_DISABLED_MEDIA_get());
  public final static pjsua_call_flag PJSUA_CALL_NO_SDP_OFFER = new pjsua_call_flag("PJSUA_CALL_NO_SDP_OFFER", pjsua2JNI.PJSUA_CALL_NO_SDP_OFFER_get());

  public final int swigValue() {
    return swigValue;
  }

  public String toString() {
    return swigName;
  }

  public static pjsua_call_flag swigToEnum(int swigValue) {
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (int i = 0; i < swigValues.length; i++)
      if (swigValues[i].swigValue == swigValue)
        return swigValues[i];
    throw new IllegalArgumentException("No enum " + pjsua_call_flag.class + " with value " + swigValue);
  }

  private pjsua_call_flag(String swigName) {
    this.swigName = swigName;
    this.swigValue = swigNext++;
  }

  private pjsua_call_flag(String swigName, int swigValue) {
    this.swigName = swigName;
    this.swigValue = swigValue;
    swigNext = swigValue+1;
  }

  private pjsua_call_flag(String swigName, pjsua_call_flag swigEnum) {
    this.swigName = swigName;
    this.swigValue = swigEnum.swigValue;
    swigNext = this.swigValue+1;
  }

  private static pjsua_call_flag[] swigValues = { PJSUA_CALL_UNHOLD, PJSUA_CALL_UPDATE_CONTACT, PJSUA_CALL_INCLUDE_DISABLED_MEDIA, PJSUA_CALL_NO_SDP_OFFER };
  private static int swigNext = 0;
  private final int swigValue;
  private final String swigName;
}


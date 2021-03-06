/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btOptimizedBvhNodeDoubleData extends BulletBase {
	private long swigCPtr;
	
	protected btOptimizedBvhNodeDoubleData(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected btOptimizedBvhNodeDoubleData(long cPtr, boolean cMemoryOwn) {
		this("btOptimizedBvhNodeDoubleData", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(btOptimizedBvhNodeDoubleData obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btOptimizedBvhNodeDoubleData(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setAabbMinOrg(btVector3DoubleData value) {
    gdxBulletJNI.btOptimizedBvhNodeDoubleData_aabbMinOrg_set(swigCPtr, this, btVector3DoubleData.getCPtr(value), value);
  }

  public btVector3DoubleData getAabbMinOrg() {
    long cPtr = gdxBulletJNI.btOptimizedBvhNodeDoubleData_aabbMinOrg_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
  }

  public void setAabbMaxOrg(btVector3DoubleData value) {
    gdxBulletJNI.btOptimizedBvhNodeDoubleData_aabbMaxOrg_set(swigCPtr, this, btVector3DoubleData.getCPtr(value), value);
  }

  public btVector3DoubleData getAabbMaxOrg() {
    long cPtr = gdxBulletJNI.btOptimizedBvhNodeDoubleData_aabbMaxOrg_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3DoubleData(cPtr, false);
  }

  public void setEscapeIndex(int value) {
    gdxBulletJNI.btOptimizedBvhNodeDoubleData_escapeIndex_set(swigCPtr, this, value);
  }

  public int getEscapeIndex() {
    return gdxBulletJNI.btOptimizedBvhNodeDoubleData_escapeIndex_get(swigCPtr, this);
  }

  public void setSubPart(int value) {
    gdxBulletJNI.btOptimizedBvhNodeDoubleData_subPart_set(swigCPtr, this, value);
  }

  public int getSubPart() {
    return gdxBulletJNI.btOptimizedBvhNodeDoubleData_subPart_get(swigCPtr, this);
  }

  public void setTriangleIndex(int value) {
    gdxBulletJNI.btOptimizedBvhNodeDoubleData_triangleIndex_set(swigCPtr, this, value);
  }

  public int getTriangleIndex() {
    return gdxBulletJNI.btOptimizedBvhNodeDoubleData_triangleIndex_get(swigCPtr, this);
  }

  public void setPad(String value) {
    gdxBulletJNI.btOptimizedBvhNodeDoubleData_pad_set(swigCPtr, this, value);
  }

  public String getPad() {
    return gdxBulletJNI.btOptimizedBvhNodeDoubleData_pad_get(swigCPtr, this);
  }

  public btOptimizedBvhNodeDoubleData() {
    this(gdxBulletJNI.new_btOptimizedBvhNodeDoubleData(), true);
  }

}

package aspects;

import crypto.*;
import java.io.*;
import java.util.*;
import javamoprt.*;

class SignatureMonitorMonitor_1_Set implements javamoprt.MOPSet {
	protected SignatureMonitorMonitor_1[] elementData;
	public int size;

	public SignatureMonitorMonitor_1_Set(){
		this.size = 0;
		this.elementData = new SignatureMonitorMonitor_1[4];
	}

	public final int size(){
		while(size > 0 && elementData[size-1].MOP_terminated) {
			elementData[--size] = null;
		}
		return size;
	}

	public final boolean add(MOPMonitor e){
		ensureCapacity();
		elementData[size++] = (SignatureMonitorMonitor_1)e;
		return true;
	}

	public final void endObject(int idnum){
		for(int i = 0; i < size; i++){
			MOPMonitor monitor = elementData[i];
			if(!monitor.MOP_terminated){
				monitor.endObject(idnum);
			}
		}
	}

	public final boolean alive(){
		for(int i = 0; i < size; i++){
			MOPMonitor monitor = elementData[i];
			if(!monitor.MOP_terminated){
				return true;
			}
		}
		return false;
	}

	public final void endObjectAndClean(int idnum){
		for(int i = 0; i < size; i++){
			MOPMonitor monitor = elementData[i];
			if(!monitor.MOP_terminated){
				monitor.endObject(idnum);
			}
			elementData[i] = null;
		}
		elementData = null;
	}

	public final void ensureCapacity() {
		int oldCapacity = elementData.length;
		if (size + 1 > oldCapacity) {
			cleanup();
		}
		if (size + 1 > oldCapacity) {
			Object oldData[] = elementData;
			int newCapacity = (oldCapacity * 3) / 2 + 1;
			if (newCapacity < size + 1){
				newCapacity = size + 1;
			}
			elementData = Arrays.copyOf(elementData, newCapacity);
		}
	}

	public final void cleanup() {
		int num_terminated_monitors = 0 ;
		for(int i = 0; i + num_terminated_monitors < size; i ++){
			SignatureMonitorMonitor_1 monitor = (SignatureMonitorMonitor_1)elementData[i + num_terminated_monitors];
			if(monitor.MOP_terminated){
				if(i + num_terminated_monitors + 1 < size){
					do{
						monitor = (SignatureMonitorMonitor_1)elementData[i + (++num_terminated_monitors)];
					} while(monitor.MOP_terminated && i + num_terminated_monitors + 1 < size);
					if(monitor.MOP_terminated){
						num_terminated_monitors++;
						break;
					}
				} else {
					num_terminated_monitors++;
					break;
				}
			}
			if(num_terminated_monitors != 0){
				elementData[i] = monitor;
			}
		}
		if(num_terminated_monitors != 0){
			size -= num_terminated_monitors;
			for(int i = size; i < size + num_terminated_monitors ; i++){
				elementData[i] = null;
			}
		}
	}

	public final void event_setup(IBS i) {
		int num_terminated_monitors = 0 ;
		for(int i_1 = 0; i_1 + num_terminated_monitors < this.size; i_1 ++){
			SignatureMonitorMonitor_1 monitor = (SignatureMonitorMonitor_1)this.elementData[i_1 + num_terminated_monitors];
			if(monitor.MOP_terminated){
				if(i_1 + num_terminated_monitors + 1 < this.size){
					do{
						monitor = (SignatureMonitorMonitor_1)this.elementData[i_1 + (++num_terminated_monitors)];
					} while(monitor.MOP_terminated && i_1 + num_terminated_monitors + 1 < this.size);
					if(monitor.MOP_terminated){
						num_terminated_monitors++;
						break;
					}
				} else {
					num_terminated_monitors++;
					break;
				}
			}
			if(num_terminated_monitors != 0){
				this.elementData[i_1] = monitor;
			}
			monitor.event_setup(i);
			if(monitor.Category_violation) {
				System.out.println("Violation!");
			}
		}
		if(num_terminated_monitors != 0){
			this.size -= num_terminated_monitors;
			for(int i_1 = this.size; i_1 < this.size + num_terminated_monitors; i_1++){
				this.elementData[i_1] = null;
			}
		}
	}

	public final void event_extract(IBS i) {
		int num_terminated_monitors = 0 ;
		for(int i_1 = 0; i_1 + num_terminated_monitors < this.size; i_1 ++){
			SignatureMonitorMonitor_1 monitor = (SignatureMonitorMonitor_1)this.elementData[i_1 + num_terminated_monitors];
			if(monitor.MOP_terminated){
				if(i_1 + num_terminated_monitors + 1 < this.size){
					do{
						monitor = (SignatureMonitorMonitor_1)this.elementData[i_1 + (++num_terminated_monitors)];
					} while(monitor.MOP_terminated && i_1 + num_terminated_monitors + 1 < this.size);
					if(monitor.MOP_terminated){
						num_terminated_monitors++;
						break;
					}
				} else {
					num_terminated_monitors++;
					break;
				}
			}
			if(num_terminated_monitors != 0){
				this.elementData[i_1] = monitor;
			}
			monitor.event_extract(i);
			if(monitor.Category_violation) {
				System.out.println("Violation!");
			}
		}
		if(num_terminated_monitors != 0){
			this.size -= num_terminated_monitors;
			for(int i_1 = this.size; i_1 < this.size + num_terminated_monitors; i_1++){
				this.elementData[i_1] = null;
			}
		}
	}

	public final void event_sign(IBS i) {
		int num_terminated_monitors = 0 ;
		for(int i_1 = 0; i_1 + num_terminated_monitors < this.size; i_1 ++){
			SignatureMonitorMonitor_1 monitor = (SignatureMonitorMonitor_1)this.elementData[i_1 + num_terminated_monitors];
			if(monitor.MOP_terminated){
				if(i_1 + num_terminated_monitors + 1 < this.size){
					do{
						monitor = (SignatureMonitorMonitor_1)this.elementData[i_1 + (++num_terminated_monitors)];
					} while(monitor.MOP_terminated && i_1 + num_terminated_monitors + 1 < this.size);
					if(monitor.MOP_terminated){
						num_terminated_monitors++;
						break;
					}
				} else {
					num_terminated_monitors++;
					break;
				}
			}
			if(num_terminated_monitors != 0){
				this.elementData[i_1] = monitor;
			}
			monitor.event_sign(i);
			if(monitor.Category_violation) {
				System.out.println("Violation!");
			}
		}
		if(num_terminated_monitors != 0){
			this.size -= num_terminated_monitors;
			for(int i_1 = this.size; i_1 < this.size + num_terminated_monitors; i_1++){
				this.elementData[i_1] = null;
			}
		}
	}

	public final void event_verify(IBS i) {
		int num_terminated_monitors = 0 ;
		for(int i_1 = 0; i_1 + num_terminated_monitors < this.size; i_1 ++){
			SignatureMonitorMonitor_1 monitor = (SignatureMonitorMonitor_1)this.elementData[i_1 + num_terminated_monitors];
			if(monitor.MOP_terminated){
				if(i_1 + num_terminated_monitors + 1 < this.size){
					do{
						monitor = (SignatureMonitorMonitor_1)this.elementData[i_1 + (++num_terminated_monitors)];
					} while(monitor.MOP_terminated && i_1 + num_terminated_monitors + 1 < this.size);
					if(monitor.MOP_terminated){
						num_terminated_monitors++;
						break;
					}
				} else {
					num_terminated_monitors++;
					break;
				}
			}
			if(num_terminated_monitors != 0){
				this.elementData[i_1] = monitor;
			}
			monitor.event_verify(i);
			if(monitor.Category_violation) {
				System.out.println("Violation!");
			}
		}
		if(num_terminated_monitors != 0){
			this.size -= num_terminated_monitors;
			for(int i_1 = this.size; i_1 < this.size + num_terminated_monitors; i_1++){
				this.elementData[i_1] = null;
			}
		}
	}
}

class SignatureMonitorMonitor_1 extends javamoprt.MOPMonitor implements Cloneable {
	public Object clone() {
		try {
			SignatureMonitorMonitor_1 ret = (SignatureMonitorMonitor_1) super.clone();
			return ret;
		}
		catch (CloneNotSupportedException e) {
			throw new InternalError(e.toString());
		}
	}

	int state;
	static final int transition_setup[] = {3, 5, 5, 3, 3, 5, 3, 7};;
	static final int transition_extract[] = {2, 2, 2, 5, 5, 5, 2, 7};;
	static final int transition_sign[] = {6, 1, 1, 4, 4, 5, 6, 7};;
	static final int transition_verify[] = {6, 2, 2, 3, 3, 5, 6, 7};;

	boolean Category_violation = false;

	public SignatureMonitorMonitor_1 () {
		state = 0;
	}

	public final void event_setup(IBS i) {
		MOP_lastevent = 0;

		state = transition_setup[state];
		Category_violation = state == 2|| state == 4|| state == 6;
		{
			System.out.println("setup() called");
		}
	}

	public final void event_extract(IBS i) {
		MOP_lastevent = 1;

		state = transition_extract[state];
		Category_violation = state == 2|| state == 4|| state == 6;
		{
			System.out.println("extract() called");
		}
	}

	public final void event_sign(IBS i) {
		MOP_lastevent = 2;

		state = transition_sign[state];
		Category_violation = state == 2|| state == 4|| state == 6;
		{
			System.out.println("sign() called");
		}
	}

	public final void event_verify(IBS i) {
		MOP_lastevent = 3;

		state = transition_verify[state];
		Category_violation = state == 2|| state == 4|| state == 6;
		{
			System.out.println("verify() called");
		}
	}

	public final void reset() {
		state = 0;
		MOP_lastevent = -1;
		Category_violation = false;
	}

	public javamoprt.MOPWeakReference MOPRef_i;

	//alive_parameters_0 = [IBS i]
	public boolean alive_parameters_0 = true;

	public final void endObject(int idnum){
		switch(idnum){
			case 0:
			alive_parameters_0 = false;
			break;
		}
		switch(MOP_lastevent) {
			case -1:
			return;
			case 0:
			//setup
			//alive_i
			if(!(alive_parameters_0)){
				MOP_terminated = true;
				return;
			}
			break;

			case 1:
			//extract
			//alive_i
			if(!(alive_parameters_0)){
				MOP_terminated = true;
				return;
			}
			break;

			case 2:
			//sign
			//alive_i
			if(!(alive_parameters_0)){
				MOP_terminated = true;
				return;
			}
			break;

			case 3:
			//verify
			//alive_i
			if(!(alive_parameters_0)){
				MOP_terminated = true;
				return;
			}
			break;

		}
		return;
	}

}

public aspect SignatureMonitorAspect {
	javamoprt.MOPMapManager SignatureMapManager;
	public SignatureMonitorAspect(){
		SignatureMapManager = new javamoprt.MOPMapManager();
		SignatureMapManager.start();
	}
	static Object SignatureMonitor_MOPLock = new Object();

	static javamoprt.MOPMap SignatureMonitor_i_Map = new javamoprt.MOPMapOfMonitor(0);
	static Object SignatureMonitor_i_Map_cachekey_0 = null;
	static Object SignatureMonitor_i_Map_cachevalue = null;

	pointcut SignatureMonitor_setup(IBS i) : (call(* setup(..)) && target(i)) && !within(SignatureMonitorAspect) && !within(SignatureMonitorMonitor_1_Set) && !within(SignatureMonitorMonitor_1) && !adviceexecution();
	after (IBS i) : SignatureMonitor_setup(i) {
		Object obj = null;
		javamoprt.MOPMap m;
		SignatureMonitorMonitor_1 monitor = null;
		SignatureMonitorMonitor_1_Set monitors = null;
		javamoprt.MOPWeakReference TempRef_i;

		synchronized(SignatureMonitor_MOPLock) {
			if(i == SignatureMonitor_i_Map_cachekey_0){
				obj = SignatureMonitor_i_Map_cachevalue;
			}

			if(obj == null) {
				obj = SignatureMonitor_i_Map.get(i);

				monitor = (SignatureMonitorMonitor_1) obj;
				if (monitor == null){
					monitor = new SignatureMonitorMonitor_1();
					monitor.MOPRef_i = new javamoprt.MOPWeakReference(i);
					SignatureMonitor_i_Map.put(monitor.MOPRef_i, monitor);
				}
				SignatureMonitor_i_Map_cachekey_0 = i;
				SignatureMonitor_i_Map_cachevalue = monitor;
			} else {
				monitor = (SignatureMonitorMonitor_1) obj;
			}
			monitor.event_setup(i);
			if(monitor.Category_violation) {
				System.out.println("Violation!");
			}
		}
	}

	pointcut SignatureMonitor_extract(IBS i) : (call(* extract(..)) && target(i)) && !within(SignatureMonitorAspect) && !within(SignatureMonitorMonitor_1_Set) && !within(SignatureMonitorMonitor_1) && !adviceexecution();
	after (IBS i) : SignatureMonitor_extract(i) {
		Object obj = null;
		javamoprt.MOPMap m;
		SignatureMonitorMonitor_1 monitor = null;
		SignatureMonitorMonitor_1_Set monitors = null;
		javamoprt.MOPWeakReference TempRef_i;

		synchronized(SignatureMonitor_MOPLock) {
			if(i == SignatureMonitor_i_Map_cachekey_0){
				obj = SignatureMonitor_i_Map_cachevalue;
			}

			if(obj == null) {
				obj = SignatureMonitor_i_Map.get(i);

				monitor = (SignatureMonitorMonitor_1) obj;
				if (monitor == null){
					monitor = new SignatureMonitorMonitor_1();
					monitor.MOPRef_i = new javamoprt.MOPWeakReference(i);
					SignatureMonitor_i_Map.put(monitor.MOPRef_i, monitor);
				}
				SignatureMonitor_i_Map_cachekey_0 = i;
				SignatureMonitor_i_Map_cachevalue = monitor;
			} else {
				monitor = (SignatureMonitorMonitor_1) obj;
			}
			monitor.event_extract(i);
			if(monitor.Category_violation) {
				System.out.println("Violation!");
			}
		}
	}

	pointcut SignatureMonitor_sign(IBS i) : (call(* sign(..)) && target(i)) && !within(SignatureMonitorAspect) && !within(SignatureMonitorMonitor_1_Set) && !within(SignatureMonitorMonitor_1) && !adviceexecution();
	before (IBS i) : SignatureMonitor_sign(i) {
		Object obj = null;
		javamoprt.MOPMap m;
		SignatureMonitorMonitor_1 monitor = null;
		SignatureMonitorMonitor_1_Set monitors = null;
		javamoprt.MOPWeakReference TempRef_i;

		synchronized(SignatureMonitor_MOPLock) {
			if(i == SignatureMonitor_i_Map_cachekey_0){
				obj = SignatureMonitor_i_Map_cachevalue;
			}

			if(obj == null) {
				obj = SignatureMonitor_i_Map.get(i);

				monitor = (SignatureMonitorMonitor_1) obj;
				if (monitor == null){
					monitor = new SignatureMonitorMonitor_1();
					monitor.MOPRef_i = new javamoprt.MOPWeakReference(i);
					SignatureMonitor_i_Map.put(monitor.MOPRef_i, monitor);
				}
				SignatureMonitor_i_Map_cachekey_0 = i;
				SignatureMonitor_i_Map_cachevalue = monitor;
			} else {
				monitor = (SignatureMonitorMonitor_1) obj;
			}
			monitor.event_sign(i);
			if(monitor.Category_violation) {
				System.out.println("Violation!");
			}
		}
	}

	pointcut SignatureMonitor_verify(IBS i) : (call(* verify(..)) && target(i)) && !within(SignatureMonitorAspect) && !within(SignatureMonitorMonitor_1_Set) && !within(SignatureMonitorMonitor_1) && !adviceexecution();
	before (IBS i) : SignatureMonitor_verify(i) {
		Object obj = null;
		javamoprt.MOPMap m;
		SignatureMonitorMonitor_1 monitor = null;
		SignatureMonitorMonitor_1_Set monitors = null;
		javamoprt.MOPWeakReference TempRef_i;

		synchronized(SignatureMonitor_MOPLock) {
			if(i == SignatureMonitor_i_Map_cachekey_0){
				obj = SignatureMonitor_i_Map_cachevalue;
			}

			if(obj == null) {
				obj = SignatureMonitor_i_Map.get(i);

				monitor = (SignatureMonitorMonitor_1) obj;
				if (monitor == null){
					monitor = new SignatureMonitorMonitor_1();
					monitor.MOPRef_i = new javamoprt.MOPWeakReference(i);
					SignatureMonitor_i_Map.put(monitor.MOPRef_i, monitor);
				}
				SignatureMonitor_i_Map_cachekey_0 = i;
				SignatureMonitor_i_Map_cachevalue = monitor;
			} else {
				monitor = (SignatureMonitorMonitor_1) obj;
			}
			monitor.event_verify(i);
			if(monitor.Category_violation) {
				System.out.println("Violation!");
			}
		}
	}
}

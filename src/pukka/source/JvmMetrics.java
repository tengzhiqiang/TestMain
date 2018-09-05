package pukka.source;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;

public class JvmMetrics implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5450067572368627599L;
	/**
	 * "name" : "Hadoop:service=NameNode,name=JvmMetrics",
	 */
	
	private double memMaxM;
	private int threadsTerminated;
	private int threadsWaiting;
	private double memNonHeapCommittedM;
	private double memNonHeapUsedM;
	private double memNonHeapMaxM;
	private int gcTotalExtraSleepTime;
	private int gcCount;
	private int threadsBlocked;
	private int logWarn;
	private double memHeapCommittedM;
	private int threadsRunnable;
	/**
	 * GcNumWarnThresholdExceeded
	 */
	@JSONField(name="GcNumWarnThresholdExceeded")
	private int gcWarn;//GcNumWarnThresholdExceeded
	private int logInfo;
	private int threadsNew;
	private double memHeapUsedM;
	private int timedWaiting;
	private double memHeapMaxM;
	private int logError;
	private int logFatal;
	private int gcTimeMillis;
	/**
	 * GcNumInfoThresholdExceeded
	 */
	@JSONField(name="GcNumInfoThresholdExceeded")
	private int GcNumInfo;//GcNumInfoThresholdExceeded
	public double getMemMaxM() {
		return memMaxM;
	}
	public void setMemMaxM(double memMaxM) {
		this.memMaxM = memMaxM;
	}
	public int getThreadsTerminated() {
		return threadsTerminated;
	}
	public void setThreadsTerminated(int threadsTerminated) {
		this.threadsTerminated = threadsTerminated;
	}
	public int getThreadsWaiting() {
		return threadsWaiting;
	}
	public void setThreadsWaiting(int threadsWaiting) {
		this.threadsWaiting = threadsWaiting;
	}
	public double getMemNonHeapCommittedM() {
		return memNonHeapCommittedM;
	}
	public void setMemNonHeapCommittedM(double memNonHeapCommittedM) {
		this.memNonHeapCommittedM = memNonHeapCommittedM;
	}
	public double getMemNonHeapUsedM() {
		return memNonHeapUsedM;
	}
	public void setMemNonHeapUsedM(double memNonHeapUsedM) {
		this.memNonHeapUsedM = memNonHeapUsedM;
	}
	public double getMemNonHeapMaxM() {
		return memNonHeapMaxM;
	}
	public void setMemNonHeapMaxM(double memNonHeapMaxM) {
		this.memNonHeapMaxM = memNonHeapMaxM;
	}
	public int getGcTotalExtraSleepTime() {
		return gcTotalExtraSleepTime;
	}
	public void setGcTotalExtraSleepTime(int gcTotalExtraSleepTime) {
		this.gcTotalExtraSleepTime = gcTotalExtraSleepTime;
	}
	public int getGcCount() {
		return gcCount;
	}
	public void setGcCount(int gcCount) {
		this.gcCount = gcCount;
	}
	public int getThreadsBlocked() {
		return threadsBlocked;
	}
	public void setThreadsBlocked(int threadsBlocked) {
		this.threadsBlocked = threadsBlocked;
	}
	public int getLogWarn() {
		return logWarn;
	}
	public void setLogWarn(int logWarn) {
		this.logWarn = logWarn;
	}
	public double getMemHeapCommittedM() {
		return memHeapCommittedM;
	}
	public void setMemHeapCommittedM(double memHeapCommittedM) {
		this.memHeapCommittedM = memHeapCommittedM;
	}
	public int getThreadsRunnable() {
		return threadsRunnable;
	}
	public void setThreadsRunnable(int threadsRunnable) {
		this.threadsRunnable = threadsRunnable;
	}
	public int getGcWarn() {
		return gcWarn;
	}
	public void setGcWarn(int gcWarn) {
		this.gcWarn = gcWarn;
	}
	public int getLogInfo() {
		return logInfo;
	}
	public void setLogInfo(int logInfo) {
		this.logInfo = logInfo;
	}
	public int getThreadsNew() {
		return threadsNew;
	}
	public void setThreadsNew(int threadsNew) {
		this.threadsNew = threadsNew;
	}
	public double getMemHeapUsedM() {
		return memHeapUsedM;
	}
	public void setMemHeapUsedM(double memHeapUsedM) {
		this.memHeapUsedM = memHeapUsedM;
	}
	public int getTimedWaiting() {
		return timedWaiting;
	}
	public void setTimedWaiting(int timedWaiting) {
		this.timedWaiting = timedWaiting;
	}
	public double getMemHeapMaxM() {
		return memHeapMaxM;
	}
	public void setMemHeapMaxM(double memHeapMaxM) {
		this.memHeapMaxM = memHeapMaxM;
	}
	public int getLogError() {
		return logError;
	}
	public void setLogError(int logError) {
		this.logError = logError;
	}
	public int getLogFatal() {
		return logFatal;
	}
	public void setLogFatal(int logFatal) {
		this.logFatal = logFatal;
	}
	public int getGcTimeMillis() {
		return gcTimeMillis;
	}
	public void setGcTimeMillis(int gcTimeMillis) {
		this.gcTimeMillis = gcTimeMillis;
	}
	public int getGcNumInfo() {
		return GcNumInfo;
	}
	public void setGcNumInfo(int gcNumInfo) {
		GcNumInfo = gcNumInfo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + GcNumInfo;
		result = prime * result + gcCount;
		result = prime * result + gcTimeMillis;
		result = prime * result + gcTotalExtraSleepTime;
		result = prime * result + gcWarn;
		result = prime * result + logError;
		result = prime * result + logFatal;
		result = prime * result + logInfo;
		result = prime * result + logWarn;
		long temp;
		temp = Double.doubleToLongBits(memHeapCommittedM);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(memHeapMaxM);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(memHeapUsedM);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(memMaxM);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(memNonHeapCommittedM);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(memNonHeapMaxM);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(memNonHeapUsedM);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + threadsBlocked;
		result = prime * result + threadsNew;
		result = prime * result + threadsRunnable;
		result = prime * result + threadsTerminated;
		result = prime * result + threadsWaiting;
		result = prime * result + timedWaiting;
		return result;
	}
	
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JvmMetrics other = (JvmMetrics) obj;
		if (GcNumInfo != other.GcNumInfo)
			return false;
		if (gcCount != other.gcCount)
			return false;
		if (gcTimeMillis != other.gcTimeMillis)
			return false;
		if (gcTotalExtraSleepTime != other.gcTotalExtraSleepTime)
			return false;
		if (gcWarn != other.gcWarn)
			return false;
		if (logError != other.logError)
			return false;
		if (logFatal != other.logFatal)
			return false;
		if (logInfo != other.logInfo)
			return false;
		if (logWarn != other.logWarn)
			return false;
		if (Double.doubleToLongBits(memHeapCommittedM) != Double.doubleToLongBits(other.memHeapCommittedM))
			return false;
		if (Double.doubleToLongBits(memHeapMaxM) != Double.doubleToLongBits(other.memHeapMaxM))
			return false;
		if (Double.doubleToLongBits(memHeapUsedM) != Double.doubleToLongBits(other.memHeapUsedM))
			return false;
		if (Double.doubleToLongBits(memMaxM) != Double.doubleToLongBits(other.memMaxM))
			return false;
		if (Double.doubleToLongBits(memNonHeapCommittedM) != Double.doubleToLongBits(other.memNonHeapCommittedM))
			return false;
		if (Double.doubleToLongBits(memNonHeapMaxM) != Double.doubleToLongBits(other.memNonHeapMaxM))
			return false;
		if (Double.doubleToLongBits(memNonHeapUsedM) != Double.doubleToLongBits(other.memNonHeapUsedM))
			return false;
		if (threadsBlocked != other.threadsBlocked)
			return false;
		if (threadsNew != other.threadsNew)
			return false;
		if (threadsRunnable != other.threadsRunnable)
			return false;
		if (threadsTerminated != other.threadsTerminated)
			return false;
		if (threadsWaiting != other.threadsWaiting)
			return false;
		if (timedWaiting != other.timedWaiting)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "JvmMetrics [memMaxM=" + memMaxM + ", threadsTerminated=" + threadsTerminated + ", threadsWaiting=" + threadsWaiting + ", memNonHeapCommittedM=" + memNonHeapCommittedM + ", memNonHeapUsedM=" + memNonHeapUsedM + ", memNonHeapMaxM=" + memNonHeapMaxM + ", gcTotalExtraSleepTime=" + gcTotalExtraSleepTime + ", gcCount=" + gcCount + ", threadsBlocked=" + threadsBlocked + ", logWarn=" + logWarn + ", memHeapCommittedM=" + memHeapCommittedM + ", threadsRunnable=" + threadsRunnable
				+ ", gcWarn=" + gcWarn + ", logInfo=" + logInfo + ", threadsNew=" + threadsNew + ", memHeapUsedM=" + memHeapUsedM + ", timedWaiting=" + timedWaiting + ", memHeapMaxM=" + memHeapMaxM + ", logError=" + logError + ", logFatal=" + logFatal + ", gcTimeMillis=" + gcTimeMillis + ", GcNumInfo=" + GcNumInfo + "]";
	}
	
	
	

}

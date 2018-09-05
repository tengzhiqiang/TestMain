package pukka.source;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;

public class RegionServer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7029657523849520528L;

	
	private int regionCount;
	private int storeCount;
	private int hlogFileCount;
	private int hlogFileSize;
	private int storeFileCount;
	private int memStoreSize;
	private int storeFileSize;
	private long maxStoreFileAge;
	private long minStoreFileAge;
	private long avgStoreFileAge;
	
	
	private int averageRegionSize;
	private int totalRequestCount;
	@JSONField(name="totalRowActionRequestCount")
	private int totalRowAction;
	private int readRequestCount;
	private int writeRequestCount;
	private int rpcGetRequestCount;
	private int rpcScanRequestCount;
	private int rpcMultiRequestCount;
	private int rpcMutateRequestCount;
	private int checkMutateFailedCount;
	private int checkMutatePassedCount;
	public int getRegionCount() {
		return regionCount;
	}
	public void setRegionCount(int regionCount) {
		this.regionCount = regionCount;
	}
	public int getStoreCount() {
		return storeCount;
	}
	public void setStoreCount(int storeCount) {
		this.storeCount = storeCount;
	}
	public int getHlogFileCount() {
		return hlogFileCount;
	}
	public void setHlogFileCount(int hlogFileCount) {
		this.hlogFileCount = hlogFileCount;
	}
	public int getHlogFileSize() {
		return hlogFileSize;
	}
	public void setHlogFileSize(int hlogFileSize) {
		this.hlogFileSize = hlogFileSize;
	}
	public int getStoreFileCount() {
		return storeFileCount;
	}
	public void setStoreFileCount(int storeFileCount) {
		this.storeFileCount = storeFileCount;
	}
	public int getMemStoreSize() {
		return memStoreSize;
	}
	public void setMemStoreSize(int memStoreSize) {
		this.memStoreSize = memStoreSize;
	}
	public int getStoreFileSize() {
		return storeFileSize;
	}
	public void setStoreFileSize(int storeFileSize) {
		this.storeFileSize = storeFileSize;
	}
	public long getMaxStoreFileAge() {
		return maxStoreFileAge;
	}
	public void setMaxStoreFileAge(long maxStoreFileAge) {
		this.maxStoreFileAge = maxStoreFileAge;
	}
	public long getMinStoreFileAge() {
		return minStoreFileAge;
	}
	public void setMinStoreFileAge(long minStoreFileAge) {
		this.minStoreFileAge = minStoreFileAge;
	}
	public long getAvgStoreFileAge() {
		return avgStoreFileAge;
	}
	public void setAvgStoreFileAge(long avgStoreFileAge) {
		this.avgStoreFileAge = avgStoreFileAge;
	}
	public int getAverageRegionSize() {
		return averageRegionSize;
	}
	public void setAverageRegionSize(int averageRegionSize) {
		this.averageRegionSize = averageRegionSize;
	}
	public int getTotalRequestCount() {
		return totalRequestCount;
	}
	public void setTotalRequestCount(int totalRequestCount) {
		this.totalRequestCount = totalRequestCount;
	}
	public int getTotalRowAction() {
		return totalRowAction;
	}
	public void setTotalRowAction(int totalRowAction) {
		this.totalRowAction = totalRowAction;
	}
	public int getReadRequestCount() {
		return readRequestCount;
	}
	public void setReadRequestCount(int readRequestCount) {
		this.readRequestCount = readRequestCount;
	}
	public int getWriteRequestCount() {
		return writeRequestCount;
	}
	public void setWriteRequestCount(int writeRequestCount) {
		this.writeRequestCount = writeRequestCount;
	}
	public int getRpcGetRequestCount() {
		return rpcGetRequestCount;
	}
	public void setRpcGetRequestCount(int rpcGetRequestCount) {
		this.rpcGetRequestCount = rpcGetRequestCount;
	}
	public int getRpcScanRequestCount() {
		return rpcScanRequestCount;
	}
	public void setRpcScanRequestCount(int rpcScanRequestCount) {
		this.rpcScanRequestCount = rpcScanRequestCount;
	}
	public int getRpcMultiRequestCount() {
		return rpcMultiRequestCount;
	}
	public void setRpcMultiRequestCount(int rpcMultiRequestCount) {
		this.rpcMultiRequestCount = rpcMultiRequestCount;
	}
	public int getRpcMutateRequestCount() {
		return rpcMutateRequestCount;
	}
	public void setRpcMutateRequestCount(int rpcMutateRequestCount) {
		this.rpcMutateRequestCount = rpcMutateRequestCount;
	}
	public int getCheckMutateFailedCount() {
		return checkMutateFailedCount;
	}
	public void setCheckMutateFailedCount(int checkMutateFailedCount) {
		this.checkMutateFailedCount = checkMutateFailedCount;
	}
	public int getCheckMutatePassedCount() {
		return checkMutatePassedCount;
	}
	public void setCheckMutatePassedCount(int checkMutatePassedCount) {
		this.checkMutatePassedCount = checkMutatePassedCount;
	}
	@Override
	public String toString() {
		return "RegionServer [regionCount=" + regionCount + ", storeCount=" + storeCount + ", hlogFileCount=" + hlogFileCount + ", hlogFileSize=" + hlogFileSize + ", storeFileCount=" + storeFileCount + ", memStoreSize=" + memStoreSize + ", storeFileSize=" + storeFileSize + ", maxStoreFileAge=" + maxStoreFileAge + ", minStoreFileAge=" + minStoreFileAge + ", avgStoreFileAge=" + avgStoreFileAge + ", averageRegionSize=" + averageRegionSize + ", totalRequestCount=" + totalRequestCount
				+ ", totalRowAction=" + totalRowAction + ", readRequestCount=" + readRequestCount + ", writeRequestCount=" + writeRequestCount + ", rpcGetRequestCount=" + rpcGetRequestCount + ", rpcScanRequestCount=" + rpcScanRequestCount + ", rpcMultiRequestCount=" + rpcMultiRequestCount + ", rpcMutateRequestCount=" + rpcMutateRequestCount + ", checkMutateFailedCount=" + checkMutateFailedCount + ", checkMutatePassedCount=" + checkMutatePassedCount + "]";
	}
	
	
}

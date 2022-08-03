class MyCalendar {
    TreeMap<Integer, Integer> calendar;
    public MyCalendar() {
        calendar = new TreeMap<>();
    }
    public boolean book(int start, int end) {
        Integer lessThanStart = calendar.floorKey(start);
        if (lessThanStart != null && calendar.get(lessThanStart) > start) 
          return false;
      
        Integer greaterThanStart = calendar.ceilingKey(start);
        if (greaterThanStart != null && greaterThanStart < end) 
          return false;
        calendar.put(start, end);
        return true;
    }
}
/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */
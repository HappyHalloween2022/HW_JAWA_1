// 1768. Объединяйте строки поочередно
class main {
    public String mergeAlternately(String word1, String word2) {
        int firstLength = word1.length();
        int secondLength = word2.length();
        int i = 0;
        int j = 0;
        StringBuilder finalResult = new StringBuilder();
        while (i < firstLength || j < secondLength) {
            if (i < firstLength) {
                finalResult.append(word1.charAt(i++));
            }
            if (j < secondLength) {
                finalResult.append(word2.charAt(j++));
            }
        }

        return finalResult.toString();

    }
}

// 27. Удалить элемент

class main {
    public int removeElement(int[] nums, int val) {

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                list.add(nums[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return list.size();
    }
}

//88. Объединить отсортированный массив

class main {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        m--;
        n--;
        int i = m + n + 1;
        while (m >= 0 && n >= 0) {
            if (nums1[m] > nums2[n]) {
                nums1[i--] = nums1[m--];
            } else {
                nums1[i--] = nums2[n--];
            }
        }
        while (m >= 0) {
            nums1[i--] = nums1[m--];
        }
        while (n >= 0) {
            nums1[i--] = nums2[n--];
        }
    }

    // 151. Переверните слова в строке

    class main 
        public String reverseWords(String s) {
            if (s == null || s.length() == 0) {
                return "";
            }
            String[] arr = s.split(" ");
            StringBuilder sb = new StringBuilder();
            for (int i = arr.length - 1; i >= 0; --i) {
                if (!arr[i].isEmpty()) {
                    sb.append(arr[i]).append(" ");
                }
            }
            return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1);
        }
    }

    // 125. Допустимый палиндром

    class main {
        public boolean isPalindrome(String s) {
            int l = 0, h = s.length() - 1;
            while (l < h) {
                char charl = s.charAt(l), charh = s.charAt(h);
                if (!Character.isLetterOrDigit(charl))
                    l++;
                else if (!Character.isLetterOrDigit(charh))
                    h--;
                else {
                    if (Character.toLowerCase(charl) != Character.toLowerCase(charh))
                        return false;
                    l++;
                    h--;
                }
            }
            return true;
        }
}


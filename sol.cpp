#include <bits/stdc++.h>
#include <ext/pb_ds/assoc_container.hpp>
using namespace std;
using namespace __gnu_pbds;

#define ll long long
#define ar array

typedef tree<int, null_type, less<int>, rb_tree_tag,
tree_order_statistics_node_update> indexed_set;

int main() {
	ios::sync_with_stdio(0);
	cin.tie(0);
	
	int n;
	cin >> n;
	int a[n];
	for(int i=0; i<n; ++i)
		cin >> a[i];
	int mx=*max_element(a, a+n);
	int id1=0, id2=0;
	for(int i=0; i<n; ++i) {
		if(a[i]==mx)
			id1=i+1;
		else if(a[i]==1)
			id2=i+1;
	}
	cout << max({id1-1, n-id1, id2-1, n-id2}) << "\n";
}

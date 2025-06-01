git config --global user.name "username"
git config --global user.email "user.mail@domain.com"
git config --global --list

git init
git clone <repo.url>

git status
git add <file_name>
git add .
git restore --staged <file_name>
git commit -m "commit message"
git commit -am "commit message"

git remote -v
git remote add origin <repo.url>
git push -u origin <branch_name>
git push
git pull(git fetch+git merge)
git fetch

git branch
git branch <new_branch_name>
git checkout <branch_name>
git checkout -b <branch_name>
git merge <branch_name>
git branch -d <branch_name>
git branch -D <branch_name>
git branch -r
git branch -a

git log
git diff
git log --oneline
git diff --staged
git reset --hard <commit_id>
git reset --soft <commid_id>
git reset <file_name>
git revert <commit_id>

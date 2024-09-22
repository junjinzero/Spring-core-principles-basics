package hello.core.member;

public class MemberServiceImpl implements MemberService{

    // npe 가 발생하지 않도록 구현체를 선택을 해준다.
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}